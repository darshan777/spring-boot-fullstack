import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public submitted: boolean;
  roomSearch: FormGroup;
  rooms: Rooms[];

  ngOnInit() {
    this.roomSearch = new FormGroup({
      checkin : new FormControl(''),
      checkout : new FormControl('')
});
    this.rooms = ROOMS;
}
 onSubmit({value, valid}: { value: Roomsearch, valid: boolean }) {
    console.log(value);
 }
 onBook(value: number) {
  console.log(value);
 }

  }
  export interface Roomsearch {
    checkin: string;
    checkout: string;
      }
  export interface Rooms {
    id: number;
    roomNumber: number;
    price: number;
    links: string;
}
let ROOMS: Rooms[] = [
  {
    'id': 121,
    'roomNumber': 1,
    'price': 120,
    'links': ''
},
{
  'id': 122,
  'roomNumber': 1,
  'price': 120,
  'links': ''
},
{
  'id': 123,
  'roomNumber': 1,
  'price': 120,
  'links': ''
},
{
  'id': 124,
  'roomNumber': 1,
  'price': 120,
  'links': ''
},
{
  'id': 125,
  'roomNumber': 1,
  'price': 120,
  'links': ''
}
];
