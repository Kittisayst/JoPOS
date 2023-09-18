
package JoPOS;

import View.DashboardView;
import View.HomeView;


public class AppDashbord {

    public AppDashbord() {
        HomeView.router.setView(new DashboardView("ໜ້າຫຼັ້ກ"));
    }
  
}
