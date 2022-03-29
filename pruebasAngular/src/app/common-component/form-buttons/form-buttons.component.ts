import {  Component, EventEmitter, Input, Output  } from '@angular/core';

@Component({
  selector: 'app-form-buttons',
  templateUrl: './form-buttons.component.html',
  styleUrls: ['./form-buttons.component.css']
})
export class FormButtonsComponent {
  @Input('send-disabled') sendDisabled: boolean | null = false;
  @Input('send-text') sendText: string = 'enviar';
  @Input('cancel-text') cancelText: string = 'volver';


  @Output() send: EventEmitter<any> = new EventEmitter<any>();
  @Output() cancel: EventEmitter<any> = new EventEmitter<any>();

}
