import { Component, OnInit } from '@angular/core';
import {ProdutoService} from '../produto.service';
import {Produto} from '../produto';

@Component({
  selector: 'app-produto-list',
  templateUrl: './produto-list.component.html',
  styleUrls: ['./produto-list.component.css']
})
export class ProdutoListComponent implements OnInit {

  produtos:Array<Produto> = [];
  constructor(private service:ProdutoService) { }

  ngOnInit() {
    this.loadData();
  }

  loadData(){
    this.service.buscarProdutos()
    .subscribe(data => this.produtos = data);
  }

  remover(id:any){
    const ok = confirm("Deseja realmente remover o produto com id "+id+"?");
    if(ok){
      this.service.remover(id)
      .subscribe(
        ()=>{
          this.loadData();

        }
      );
    }
  }

}
