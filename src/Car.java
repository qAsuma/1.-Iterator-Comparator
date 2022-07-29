//В папке с примерами, ex_004_comparable.
// Дописать логику, чтобы метод compareTo() осуществил поиск по скорости(если же скорость у 2-х объектов равна, то ищем по цене) -> цене - > моделе -> цвету машины.
public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости-> цене - > моделе -> цвету
    public int compareTo(Car o) {
        if (this.speed - o.speed == 0) {
            return this.price - o.price;
        } else if (this.price - o.price == 0) {
            return this.model.compareTo(o.model);
        } else if (this.model.compareTo(o.model) == 0) {
            return this.color.compareTo(o.color);
        }
        return 0;
    }


}