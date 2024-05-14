public class Product {
    public Product() {
        System.out.println("Constructor worked.");

    }

    public Product(int id, String name, String description, double price, int stockAmount, String color, String code) {
        this._id = id;
        this._name = name;
        this._description = description;
        this._price = price;
        this._stockAmount = stockAmount;
        this._color = color;
        this._code = code;
    }

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _color;
    private String _code;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String _color) {
        this._color = _color;
    }

    public String get_code() {
        return _code;
    }

    public void set_code(String _code) {
        this._code = _code;
    }
}
