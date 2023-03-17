import presenter.Presenter;
import ui.DesktopUI;
import ui.View;
import weather_api.Service;
import weather_api.WeatherService;

public class Main {
    public static void main(String[] args) {
        View view = new DesktopUI();
        Service service = new WeatherService();
        Presenter presenter = new Presenter(view, service);
        view.start();
    }
}
