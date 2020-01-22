import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateCustomerAdminComponent } from './update-customer-admin.component';

describe('UpdateCustomerAdminComponent', () => {
  let component: UpdateCustomerAdminComponent;
  let fixture: ComponentFixture<UpdateCustomerAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateCustomerAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateCustomerAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
