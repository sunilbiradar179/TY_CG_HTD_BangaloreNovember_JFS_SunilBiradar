import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewClientAdminComponent } from './view-client-admin.component';

describe('ViewClientAdminComponent', () => {
  let component: ViewClientAdminComponent;
  let fixture: ComponentFixture<ViewClientAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewClientAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewClientAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
