package presenter;

import ui.View;
import weather_api.Service;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void onClick(String city) {
        String weather = service.get(city);
        view.printAnswer(weather);
    }
}
