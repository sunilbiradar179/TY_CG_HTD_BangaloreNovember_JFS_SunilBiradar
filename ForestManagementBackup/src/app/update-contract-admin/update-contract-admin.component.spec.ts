import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateContractAdminComponent } from './update-contract-admin.component';

describe('UpdateContractAdminComponent', () => {
  let component: UpdateContractAdminComponent;
  let fixture: ComponentFixture<UpdateContractAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateContractAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateContractAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
