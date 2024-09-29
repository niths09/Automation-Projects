# Qafox Automation Project

This project is an automated test suite for the [Qafox demo site](https://tutorialsninja.com/demo/index.php?route=common/home) using **Selenium WebDriver**, **TestNG**, and **Maven**. The test suite covers various user interactions on the website, including account login, address entry, product search, cart operations, and checkout.

## Project Structure

The project consists of multiple page object classes, each responsible for different functionalities on the site:

- **AccountPage**: Handles login, account management, and currency selection.
- **AddressPage**: Manages adding and editing addresses in the user's account.
- **SearchPage**: Manages searching for products on the site.
- **ProductPageOne, Two, and Three**: Responsible for product selection, adding products to the cart, and navigating through product pages.
- **WishlistPage**: Handles adding and removing products to/from the wishlist.
- **ComparisonPage**: Manages product comparisons and adding items to the cart.
- **CartPage**: Handles cart operations, such as updating quantities and applying shipping quotes.
- **CheckoutPage**: Manages the final checkout process, including billing and shipping.

## Test Cases

Here is a summary of the main test cases covered:

1. **Login to Account**  
   Verify user login with valid credentials and currency selection.
   
2. **Add New Address**  
   Add a new address in the account's address book, including all required fields.
   
3. **Search for a Product (iPhone)**  
   Perform a search for an iPhone and validate the search results.
   
4. **Add Products to Cart**  
   Add an iPhone, a Samsung monitor and a HP laptop to the shopping cart with a custom quantity.
   
5. **Handle Wishlist Operations**  
   Add a camera and a laptop to the wishlist, then remove an item from the wishlist.
   
6. **Compare Products and Add to Cart**  
   Compare two mobile phones, add one to the cart, and remove items from the comparison list.
   
7. **Proceed with Checkout**  
   Complete the checkout process, including billing, shipping, and payment steps.
   
8. **Confirm Order with Comments**  
   Confirm the order with the comment: `Handle with care. Thanks!`

## Prerequisites

To run this project, you will need the following:

- Java (JDK 8 or higher)
- Maven
- ChromeDriver (make sure it's compatible with your Chrome version)
- TestNG
- Selenium WebDriver

## Installation and Setup

1. Clone this repository:

   ```bash
   git clone https://github.com/niths09/Automation-Projects.git
