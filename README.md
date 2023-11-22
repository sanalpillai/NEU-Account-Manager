# NEU-Account-Manager
NEU Account Manager Application Made On Java Swing

## Description
This repository hosts a Java Swing application designed as a user account management system for educational institutions, specifically tailored for Northeastern University (NEU). The application serves as an exercise in implementing a login screen and managing user accounts, focusing on security through password hashing and account control functionality.

## Features

### Manage Persons
- **Add Person**: Allows the creation of a new person entry.
- **List Persons**: Displays a list of all created person entries.
- **Search for Person**: Provides a search feature to find a person by their NEU ID.

### Managing User Accounts (Administrator)
- **Create User Account**: Lets the administrator create a user account from a person's profile using their NEU ID.
- **Reset/Update Login Credentials**: Empowers the admin to reset or update usernames and passwords. Passwords are stored as hashes for security.
- **Disable User Account**: Grants the administrator the option to disable any user account, preventing login regardless of credentials.

### User Login and Personal Information Management
- **User Login**: Users can log in to access a landing page displaying their personal information.
- **Update Personal Information**: Users can update their personal details.
- **Password Update with History Block**: Allows users to change their passwords while preventing the reuse of previously used passwords.

## How to Run
1. Clone the repository to your local machine.
2. Open the Netbeans IDE or any other Java IDE that supports Swing applications.
3. Import the project into your IDE.
4. Ensure that the Java Development Kit (JDK) is installed on your machine.
5. Build the project to resolve any dependencies.
6. Run the application from the main class which contains the main method.

## Dependencies
- Java Runtime Environment (JRE) 1.8 or higher.
- Java Cryptography Architecture (JCA) for implementing secure password hashing.
- Any additional libraries used should be listed here, along with instructions on how to install or integrate them into the project.

## Security Measures
- Passwords are hashed using the SHA-256 hashing algorithm provided by the Java Cryptography Architecture.
- Best practices are followed to ensure that all user data is handled securely.
- The application includes functionality to prevent the reuse of previously used passwords.

## Contributions
This project is currently not open for contributions. However, feedback on the functionality and security of the application is always welcome.

## License
This project is released under the MIT License. See the LICENSE file in the repository for full details.

## Acknowledgements
Special thanks to the instructors and peers at Northeastern University for their guidance and support throughout the development of this project.

---

Developed by: Sanal Pillai
