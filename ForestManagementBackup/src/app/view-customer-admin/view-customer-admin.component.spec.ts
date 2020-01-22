import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewCustomerAdminComponent } from './view-customer-admin.component';

describe('ViewCustomerAdminComponent', () => {
  let component: ViewCustomerAdminComponent;
  let fixture: ComponentFixture<ViewCustomerAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewCustomerAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewCustomerAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
