import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewSchedulerAdminComponent } from './view-scheduler-admin.component';

describe('ViewSchedulerAdminComponent', () => {
  let component: ViewSchedulerAdminComponent;
  let fixture: ComponentFixture<ViewSchedulerAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewSchedulerAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewSchedulerAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
