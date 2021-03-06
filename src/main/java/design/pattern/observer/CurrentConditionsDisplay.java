package design.pattern.observer;

/**
 * @author cherbini
 * 2018/10/23 17:57
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this::update);
    }

    @Override
    public void display()
    {
        System.out.println("Current conditions: "+temperature+" F degree and "+humidity+"% humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }

}
