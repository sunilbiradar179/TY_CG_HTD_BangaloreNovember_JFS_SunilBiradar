import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NgModule, Component } from '@angular/core';
import { RouterModule } from '@angular/router';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AdminComponent } from './admin/admin.component';
import { ClientComponent } from './client/client.component';
import { SchedulerComponent } from './scheduler/scheduler.component';
import { AddClientComponent } from './add-client/add-client.component';
import { from } from 'rxjs';
import { DeleteClientComponent } from './delete-client/delete-client.component';
import { UpdateClientComponent } from './update-client/update-client.component';
import { ViewClientComponent } from './view-client/view-client.component';
import { CustomerComponent } from './customer/customer.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { ViewCustomersComponent } from './view-customers/view-customers.component';
import { ProductComponent } from './product/product.component';
import { AddProductComponent } from './add-product/add-product.component';
import { ViewProductsComponent } from './view-products/view-products.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { ContractComponent } from './contract/contract.component';
import { AddContractComponent } from './add-contract/add-contract.component';
import { ViewContractsComponent } from './view-contracts/view-contracts.component';
import { UpdateContractComponent } from './update-contract/update-contract.component';
import { AddSchedulerComponent } from './add-scheduler/add-scheduler.component';
import { ViewSchedulersComponent } from './view-schedulers/view-schedulers.component';
import { UpdateSchedulerComponent } from './update-scheduler/update-scheduler.component';
import { UpdateClientAdminComponent } from './update-client-admin/update-client-admin.component';
import { UpdateSchedulerAdminComponent } from './update-scheduler-admin/update-scheduler-admin.component';
import { UpdateCustomerAdminComponent } from './update-customer-admin/update-customer-admin.component';
import { UpdateContractAdminComponent } from './update-contract-admin/update-contract-admin.component';
import { UpdateProductAdminComponent } from './update-product-admin/update-product-admin.component';
import { ViewClientAdminComponent } from './view-client-admin/view-client-admin.component';
import { ViewSchedulerAdminComponent } from './view-scheduler-admin/view-scheduler-admin.component';
import { ViewCustomerAdminComponent } from './view-customer-admin/view-customer-admin.component';
import { ViewContractAdminComponent } from './view-contract-admin/view-contract-admin.component';
import { ViewProductAdminComponent } from './view-product-admin/view-product-admin.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    LogoutComponent,
    AdminComponent,
    ClientComponent,
    SchedulerComponent,
    AddClientComponent,
    DeleteClientComponent,
    UpdateClientComponent,
    ViewClientComponent,
    CustomerComponent,
    AddCustomerComponent,
    ViewCustomersComponent,
    ProductComponent,
    AddProductComponent,
    ViewProductsComponent,
    UpdateCustomerComponent,
    UpdateProductComponent,
    ContractComponent,
    AddContractComponent,
    ViewContractsComponent,
    UpdateContractComponent,
    AddSchedulerComponent,
    ViewSchedulersComponent,
    UpdateSchedulerComponent,
    UpdateClientAdminComponent,
    UpdateSchedulerAdminComponent,
    UpdateCustomerAdminComponent,
    UpdateContractAdminComponent,
    UpdateProductAdminComponent,
    ViewClientAdminComponent,
    ViewSchedulerAdminComponent,
    ViewCustomerAdminComponent,
    ViewContractAdminComponent,
    ViewProductAdminComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule.forRoot([
      {path:'',component:HomeComponent},
      {path:'admin',component:AdminComponent},
      {path:'update-client-admin',component:UpdateClientAdminComponent},
      {path:'update-scheduler-admin',component:UpdateSchedulerAdminComponent},
      {path:'update-customer-admin',component:UpdateCustomerAdminComponent},
      {path:'update-product-admin',component:UpdateProductAdminComponent},
      {path:'update-contract-admin',component:UpdateContractAdminComponent},
      {path:'client',component:ClientComponent},
      {path:'add-client',component:AddClientComponent},
      {path:'view-client',component:ViewClientComponent},
      {path:'update-client',component:UpdateClientComponent},
      {path:'scheduler',component:SchedulerComponent},
      {path:'add-scheduler',component:AddSchedulerComponent},
      {path:'view-schedulers',component:ViewSchedulersComponent},
      {path:'update-scheduler',component:UpdateSchedulerComponent},
      {path:'login',component:LoginComponent},
      {path:'logout',component:LogoutComponent},
      {path:'customer',component:CustomerComponent},
      {path:'add-customer',component:AddCustomerComponent},
      {path:'view-customers',component:ViewCustomersComponent},
      {path:'update-customer',component:UpdateCustomerComponent},
      {path:'product',component:ProductComponent},
      {path:'add-product',component:AddProductComponent},
      {path:'view-products',component:ViewProductsComponent},
      {path:'update-product',component:UpdateProductComponent},
      {path:'contract',component:ContractComponent},
      {path:'add-contract',component:AddContractComponent},
      {path:'view-contracts',component:ViewContractsComponent},
      {path:'update-contract',component:UpdateContractComponent},
      

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
