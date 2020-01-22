import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateSchedulerAdminComponent } from './update-scheduler-admin.component';

describe('UpdateSchedulerAdminComponent', () => {
  let component: UpdateSchedulerAdminComponent;
  let fixture: ComponentFixture<UpdateSchedulerAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateSchedulerAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateSchedulerAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
