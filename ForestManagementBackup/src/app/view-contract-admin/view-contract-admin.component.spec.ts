import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewContractAdminComponent } from './view-contract-admin.component';

describe('ViewContractAdminComponent', () => {
  let component: ViewContractAdminComponent;
  let fixture: ComponentFixture<ViewContractAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewContractAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewContractAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
