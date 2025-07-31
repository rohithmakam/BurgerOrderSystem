# BurgerOrderSystem

A Java-based console application for simulating a burger restaurant ordering system. Users can create customized meal orders with regular or deluxe burgers, toppings, drinks, and sides, featuring dynamic pricing and itemized billing.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project-Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Features

- **Customizable Meal Orders:** Create meals with regular burgers (up to 3 toppings) or deluxe burgers (up to 5 free toppings, e.g., bacon, avocado).
- **Dynamic Pricing:** Calculates costs based on toppings (e.g., $1.50 for bacon, $1.00 for cheese) and sizes (small: -$0.50, large: +$1.00).
- **Itemized Billing:** Generates formatted receipts detailing burgers, toppings, drinks, sides, and total price.
- **Object-Oriented Design:** Utilizes inheritance (Burger and DeluxeBurger extend Item), polymorphism, and encapsulation for modular code.
- **Extensible:** Easily supports additional menu items or pricing rules.

## Installation

**Clone the Repository:**
```bash
git clone https://github.com/rohithmakam/BurgerOrderSystem.git
cd BurgerOrderSystem
```

**Compile the Project:**
```bash
javac *.java
```
Alternatively, open the project in a Java IDE (IntelliJ, Eclipse, VS Code) and build it using the IDE’s tools.

## Usage

Run the main application:
```bash
java Main
```
The program demonstrates a sample deluxe burger meal with toppings, a drink, and a side. To enable interactive ordering, modify `Main.java` to use `Scanner` for user input (sample code available in prior versions).

**Sample Output:**
```
           BASE BURGER:   8.50
           TOPPING LETTUCE:   0.00
           TOPPING CHEESE:   0.00
           TOPPING MAYO:   0.00
           TOPPING AVOCADO:   0.00
           TOPPING BACON:   0.00
           SMALL PEPSI:   0.00
           CHILLI:   0.00
------------------------------
           DELUXE BURGER:   8.50
           TOTAL PRICE:   8.50
```

## Project Structure

- `Item.java`: Base class for menu items with pricing and size logic.
- `Burger.java`: Manages regular burgers with up to 3 paid toppings.
- `DeluxeBurger.java`: Extends Burger for deluxe burgers with 5 free toppings.
- `MealOrder.java`: Orchestrates complete meals (burger, drink, side) and total pricing.
- `Main.java`: Demonstrates a sample deluxe meal order.

## Contributing

Contributions are welcome!

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to your branch (`git push origin feature/your-feature`).
5. Open a pull request.

For major changes, please open an issue first to discuss your ideas.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

Maintainer: rohithmakam  
Project Link: [https://github.com/rohithmakam/BurgerOrderSystem](https://github.com/rohithmakam/BurgerOrderSystem)
