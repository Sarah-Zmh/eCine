import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { FooterComponent } from './components/layouts/footer/footer.component';
import { HeaderComponent } from './components/layouts/header/header.component';
import { MainContentComponent } from './components/layouts/main-content/main-content.component';
import { NavigationMenuComponent } from './components/layouts/navigation-menu/navigation-menu.component';
import { RightSidebarComponent } from './components/layouts/right-sidebar/right-sidebar.component';
import { VisitorDashboardComponent } from './components/main-dashboard/visitor-dashboard/visitor-dashboard.component';
import { AdminDashboardComponent } from './components/main-dashboard/admin-dashboard/admin-dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    VisitorDashboardComponent,
    AdminDashboardComponent,
    LoginComponent,
    FooterComponent,
    HeaderComponent,
    MainContentComponent,
    NavigationMenuComponent,
    RightSidebarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
