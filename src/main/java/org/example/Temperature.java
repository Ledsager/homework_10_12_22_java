package org.example;


class Temperature implements Converter {

    public double convertValue(double temperature) {
        return temperature;
    }
}

class convertKelvin1 extends Temperature {
    /**
     * //     * @return температура Кельвин
     */
    @Override
    public double convertValue(double temperature) {
        return temperature + 273.15;
    }
}

class convertFahrenheit1 extends Temperature {
    /**
     * @return температура Фаренгейт
     */
    @Override
    public double convertValue(double temperature) {
        return ((9 / 5) * temperature) + 32;
    }
}
//class convertKelvin implements Converter {
//    /**
//     * //     * @return температура Кельвин
//     */
//    public double convertValue(double temperature) {
//        return temperature + 273.15;
//    }
//}
//class convertFahrenheit implements Converter {
//    /**
//     * @return температура Фаренгейт
//     */
//    public double convertValue(double temperature) {
//        return ((9 / 5) * temperature) + 32;
//    }
//}

//    private Double temperature;
//    private ConverterImpl(double temperature)
//    {
//        this.temperature = temperature;
//    }
//
//    public Double getTemperCelsius() {
//        return temperCelsius;
//    }
//
//    public Temperature(Double temperCelsius) {
//        this.temperCelsius = temperCelsius;
//    }
//    @Override
//    public String toTemperature(){
//        return "Temperature Celsius : " + temperCelsius;
//    }
//
//    /**
//     * @return температура Кельвин
//     */
//    public double tempKelvin(Temperature temperature) {
//        return temperature.temperCelsius + 273.15;
//    }
//
//    /**
//     * @return температура Фаренгейт
//     */
//    public double tempFahrenheit(Temperature temperature) {
//        return ((9 / 5) * temperature.temperCelsius) + 32;
//    }
