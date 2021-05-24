import { Component, OnInit } from '@angular/core';

declare interface TableData {
  headerRow: string[];
  dataRows: string[][];
}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
     tableData1!: TableData;
     tableData2!: TableData;

  constructor() { }

  ngOnInit() {
      this.tableData1 = {
          headerRow: [ 'ID', 'Titre', 'Fiche', 'Realisateur'],
          dataRows: [
              ['1', 'Dakota Rice', 'Niger', 'Oud-Turnhout'],
             
          ]
      };
     
  }

}