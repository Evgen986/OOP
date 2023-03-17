package weather_api;

import weather_api.weather.Weather;

public class WeatherService implements Service{
    private static final String EMPTY_ERROR = "Вы ввели не город!";

    private Connection connection;
    private Formatter formatter;

    public WeatherService() {
        connection = new Connection();
        formatter = new Formatter();
    }

    @Override
    public String get(String city) {
        try {
            String info = connection.getInfo(city);
            Weather weather = formatter.parse(info);
            String answer = weather.toString();
            return answer;
        }catch (NullPointerException e){
            return EMPTY_ERROR;
        } catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
