package org.example;

public class Temperature {
    private Double temperCelsius;

//    public Double getTemperCelsius() {
//        return temperCelsius;
//    }

    public Temperature(Double temperCelsius) {
        this.temperCelsius = temperCelsius;
    }

//    @Override
//    public String toTemperature(){
//        return "Temperature Celsius : " + temperCelsius;
//    }

    /**
     * @return температура Кельвин
     */
    public double tempKelvin(Temperature temperature) {
        return temperature.temperCelsius + 273.15;
    }

    /**
     * @return температура Фаренгейт
     */
    public double tempFahrenheit(Temperature temperature) {
        return ((9 / 5) * temperature.temperCelsius) + 32;
    }

}
