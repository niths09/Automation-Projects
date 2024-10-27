# CURA Healthcare Service Automation Project

This project is an automated test suite for the CURA Healthcare Service demo site, created using Selenium WebDriver and TestNG. The suite automates various actions on the website, including login, appointment booking, appointment history review, and logout.

## Project Structure

The project uses the Page Object Model (POM) to create modular classes for different functionalities on the site:

- **Login_Page**: Manages user login actions, including navigation, entering credentials, and signing in.
- **Appointment_Page**: Handles booking appointments by selecting facilities, readmission options, healthcare programs, dates, and comments.
- **Confirmation_Page**: Manages confirmation actions post-booking, such as navigating to the homepage.
- **History_Page**: Manages navigation to and interactions within the appointment history.
- **Logout_Page**: Handles user logout actions, including accessing the sidebar and logging out.

## Test Cases

Here is a summary of the main test cases covered by this suite:

1. **Login to CURA Healthcare**  
   - Access the login page and sign in with valid credentials.

2. **Book an Appointment**  
   - Select the facility, readmission options, healthcare program, appointment date, and add comments.
   - Confirm and book the appointment.

3. **Confirm Appointment**  
   - Navigate to the homepage after confirming the appointment.

4. **View Appointment History**  
   - Access and review past appointment history.

5. **Logout from CURA Healthcare**  
   - Log out and return to the homepage.

## Prerequisites

To run this project, ensure you have the following installed:

- **Java** (JDK 8 or higher)
- **Maven**
- **ChromeDriver** (compatible with your Chrome version)
- **TestNG**
- **Selenium WebDriver**

## Installation and Setup

1. Clone this repository:

   ```bash
   git clone https://github.com/niths09/Automation-Projects.git
   ```

2. Open the project in your preferred IDE and update the **ChromeDriver** path if necessary.

3. To execute the test suite, run the `CuraHealthcare_Page` class using TestNG.
