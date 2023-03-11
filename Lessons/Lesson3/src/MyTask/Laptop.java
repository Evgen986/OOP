package MyTask;

import java.math.BigDecimal;
import java.time.chrono.MinguoDate;
import java.util.Iterator;

/**
 * Класс объекта ноутбук
 */


public class Laptop{

    private final BigDecimal MIN_PRICE = new BigDecimal(0);
    private String manufacturer;
    private String model;
    private Double screenDiagonal;
    private Integer releaseYear;
    private String operatingSystem;
    private String processorManufacturer;
    private String processorModel;
    private Integer ram;
    private String typeOfGraphicsAccelerator;
    private String builtInVideoCardModel;
    private String discreteGraphicsCardModel;
    private Integer videoMemorySize;
    private String storageType;
    private Integer ssdVolume;
    private Integer hddVolume;
    private String laptopType;
    private String color;
    private BigDecimal price;

    public Laptop(String manufacturer, String model, Double screenDiagonal, Integer releaseYear, String operatingSystem, String processorManufacturer, String processorModel, Integer ram, String typeOfGraphicsAccelerator, String builtInVideoCardModel, String discreteGraphicsCardModel, Integer videoMemorySize, String storageType, Integer ssdVolume, Integer hddVolume, String laptopType, String color, BigDecimal price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenDiagonal = screenDiagonal;
        this.releaseYear = releaseYear;
        this.operatingSystem = operatingSystem;
        this.processorManufacturer = processorManufacturer;
        this.processorModel = processorModel;
        this.ram = ram;
        this.typeOfGraphicsAccelerator = typeOfGraphicsAccelerator;
        this.builtInVideoCardModel = builtInVideoCardModel;
        this.discreteGraphicsCardModel = discreteGraphicsCardModel;
        this.videoMemorySize = videoMemorySize;
        this.storageType = storageType;
        this.ssdVolume = ssdVolume;
        this.hddVolume = hddVolume;
        this.laptopType = laptopType;
        this.color = color;
        this.price = price;
    }


    public void setPrice(BigDecimal price) {
        if (price.compareTo(MIN_PRICE) <= 0){
            System.out.println("Цена не может быть равна или меньше нуля!");
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Ноутбук " + manufacturer + " " + model + ":\n" +
                "Диагональ экрана = " + screenDiagonal + '\n' +
                "Год релиза = " + releaseYear + '\n' +
                "ОС = " + operatingSystem + '\n' +
                "Производитель процессора = " + processorManufacturer + '\n' +
                "Модель процессора = " + processorModel + '\n' +
                "ОЗУ = " + ram + "Гб" + '\n' +
                "Тип графики = " + typeOfGraphicsAccelerator + '\n' +
                "Встроенная графика = " + builtInVideoCardModel + '\n' +
                "Дискретная графика = " + discreteGraphicsCardModel + '\n' +
                "Объем видеопамяти = " + videoMemorySize + "Гб" + '\n' +
                "Хранение данных = " + storageType + '\n' +
                "Объем SSD = " + ssdVolume + "Гб" + '\n' +
                "Объем HDD = " + hddVolume + "Гб" + '\n' +
                "Тип ноутбука = " + laptopType + '\n' +
                "Цвет = " + color + '\n' +
                "Цена = " + price + '\n';
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(Double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getProcessorManufacturer() {
        return processorManufacturer;
    }

    public void setProcessorManufacturer(String processorManufacturer) {
        this.processorManufacturer = processorManufacturer;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getTypeOfGraphicsAccelerator() {
        return typeOfGraphicsAccelerator;
    }

    public void setTypeOfGraphicsAccelerator(String typeOfGraphicsAccelerator) {
        this.typeOfGraphicsAccelerator = typeOfGraphicsAccelerator;
    }

    public String getBuiltInVideoCardModel() {
        return builtInVideoCardModel;
    }

    public void setBuiltInVideoCardModel(String builtInVideoCardModel) {
        this.builtInVideoCardModel = builtInVideoCardModel;
    }

    public String getDiscreteGraphicsCardModel() {
        return discreteGraphicsCardModel;
    }

    public void setDiscreteGraphicsCardModel(String discreteGraphicsCardModel) {
        this.discreteGraphicsCardModel = discreteGraphicsCardModel;
    }

    public Integer getVideoMemorySize() {
        return videoMemorySize;
    }

    public void setVideoMemorySize(Integer videoMemorySize) {
        this.videoMemorySize = videoMemorySize;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public Integer getSsdVolume() {
        return ssdVolume;
    }

    public void setSsdVolume(Integer ssdVolume) {
        this.ssdVolume = ssdVolume;
    }

    public Integer getHddVolume() {
        return hddVolume;
    }

    public void setHddVolume(Integer hddVolume) {
        this.hddVolume = hddVolume;
    }

    public String getLaptopType() {
        return laptopType;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
