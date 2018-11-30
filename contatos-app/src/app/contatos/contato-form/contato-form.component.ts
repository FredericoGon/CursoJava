import { Component, OnInit } from '@angular/core';
import {FormBuilder,Validators} from '@angular/forms';

@Component({
  selector: 'app-contato-form',
  templateUrl: './contato-form.component.html',
  styleUrls: ['./contato-form.component.css']
})
export class ContatoFormComponent implements OnInit {

  contatoForm = this.fb.group({
    id:[''],
    nome: ['',Validators.required],
    email:['', Validators.required,Validators.email],
    telefone:['']
  });
  constructor(private fb:FormBuilder) { }

  ngOnInit() {
  }

}
