import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { NzNotificationService } from 'ng-zorro-antd/notification';
import { AuthService } from '../../services/auth/auth.service';
import { last } from 'rxjs';
import { CommonModule } from '@angular/common';
import { DemoNgZorroAntdModule } from '../../../DemoNgZorroAntdModule';

@Component({
  selector: 'app-signup-client',
  templateUrl: './signup-client.component.html',
  styleUrls: ['./signup-client.component.scss'],
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, RouterModule, DemoNgZorroAntdModule]
})
export class SignupClientComponent {

  validateForm!: FormGroup;

  constructor(private fb: FormBuilder,
    private authService: AuthService,
    private notification: NzNotificationService,
    private router: Router) { }

  ngOnInit() {
    this.validateForm = this.fb.group({
      email: [null, [Validators.email, Validators.required]],
      name: [null, [Validators.required]],
      lastName: [null, [Validators.required]],
      phone: [null],
      password: [null, [Validators.required]],
      checkPassword: [null, [Validators.required]],
    })
  }

  submitForm() {
    this.authService.registerClient(this.validateForm.value).subscribe(res => {
      this.notification
        .success(
          'SUCCESS',
          `Signup successful`,
          { nzDuration: 5000 }
        );
      this.router.navigateByUrl('/login');
    }, error => {
      this.notification
        .error(
          'ERROR',
          `${error.error}`,
          { nzDuration: 5000 }
        )
    });
  }
}
