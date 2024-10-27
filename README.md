
# Swag Labs Automation Project

This project is an automated test suite for the SwagLabs demo site using Selenium WebDriver, TestNG, and Maven. The test suite covers various user interactions on the website, including login, social media link validation, product sorting, cart operations, and checkout.

## Project Structure

The project consists of multiple page object classes, each responsible for different functionalities on the site:

- **LoginPage**: Manages user login with username and password.
- **HomePage**: Handles interactions with social media links on the homepage.
- **ProductPage**: Manages product sorting, product selection, and adding products to the cart.
- **CartPage**: Handles cart operations, such as viewing the cart, removing items, and proceeding to checkout.
- **CheckOutPage**: Manages the checkout process, including entering customer details and completing the purchase.
- **LogoutPage**: Handles the logout functionality from the user account.

## Test Cases

Here is a summary of the main test cases covered:

- **Login to SwagLabs Account**  
  Verify user login with valid credentials.

- **Validate Social Media Links**  
  Click and validate Twitter, Facebook, and LinkedIn links.

- **Sort and Select Products**  
  Sort products by name and price, then add items to the cart.

- **Cart Operations**  
  View the cart, remove items, and proceed to checkout.

- **Checkout Process**  
  Complete the checkout process by entering required details and finishing the purchase.

- **Logout**  
  Log out of the SwagLabs account.

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or above
- **Apache Maven**: For project dependency management
- **Selenium WebDriver**: Configured in the project dependencies
- **TestNG**: For managing test cases
- **Web Browser**: Chrome (recommended) or Firefox

## Installation and Setup

1. Clone the Repository:
   ```bash
   git clone https://github.com/niths09/Automation-Projects.git
   ```
2. Open the project in your preferred IDE and update the ChromeDriver path if necessary.

3. To execute the test suite, run the CuraHealthcare_Page class using TestNG.
