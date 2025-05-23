package UserCheak;

public class User {
    private String firstName;
    private String lastName;
    private String personalNumber;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String username;
    private String password;
    public User(String firstName, String lastName, String personalNumber, int birthYear, int birthMonth, int birthDay, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalNumber = personalNumber;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.username = username;
        this.password = password;
    }

    public boolean isValidUser(){
        int currentYear = java.time.Year.now().getValue();
        try {
            if (firstName.length() < 2) {
                throw new InvalidNameException("First name must be at least 2 characters.");
            }
            if (lastName.length() < 3) {
                throw new InvalidSurnameException("Last name must be at least 3 characters.");
            }
            if (personalNumber.length() != 11) {
                throw new InvalidPersonalNumberException("Personal number must be exactly 11 digits.");
            }
            for (int i = 0; i < personalNumber.length(); i++) {
                if (!Character.isDigit(personalNumber.charAt(i))) {
                    throw new InvalidPersonalNumberException("Personal number must contain only digits.");
                }
            }
            if (birthYear > currentYear){
                throw new InvalidBirthDateException("Birth year must not be greater than current year.");
            }
            if (birthMonth < 1 || birthMonth > 12) {
                throw new InvalidBirthDateException("Birth month must be between 1 and 12.");
            }
            if (birthDay < 1 || birthDay > 31){
                throw new InvalidBirthDateException("Birth day must be between 1 and 31.");
            }
            if (username.length() < 4) {
                throw new InvalidUsernameException("Username must be at least 4 characters.");
            }
            if (password.length() < 8 || password.length() > 15){
                throw new InvalidPasswordException("Password must be between 8 and 15 characters.");
            }

        } catch (InvalidNameException | InvalidSurnameException | InvalidPersonalNumberException | InvalidBirthDateException |
                 InvalidUsernameException | InvalidPasswordException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }


    public String toString() {
        return "User: " + firstName + " " + lastName + " Personal Number: " + personalNumber + ", Date of Birth: " + birthYear + "-" + birthMonth + "-" + birthDay + ", Username: " + username;
    }

}
