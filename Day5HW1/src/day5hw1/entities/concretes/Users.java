package day5hw1.entities.concretes;

import java.util.regex.*;
import day5hw1.entities.abstracts.UserInputChecker;


public class Users implements UserInputChecker{

		private String name;
		private String surname;
	    private String email;
		private String password;
		private boolean signUpProcessTracker=true;
		
		//Email and Password check is directly happens after declared in struct.
		//If It's wrong it returns without any other value assignment and give a error print.
		//When something is wrong it makes signUpProcessTracker variable "false" and warns to ProductManager constructor.
		//With this, we can easily understand Sign Up process is successful or not.
		
			public Users() {
				
			}
		
		
		  public Users(String name, String surname, String email, String password) {
			  this.email = email;
			  if(emailChecker(email)==true) {
					System.out.println("Email is OK.");
				}
				else {
					System.out.println("Email validation failed! Try again!");
					this.signUpProcessTracker=false;
					return; }
			  
			  this.password = password;
				if(passwordChecker(password)==true) {
					System.out.println("Password is OK.");
				}
				else {
					System.out.println("Password is not fit with standarts! It must be longer than 6 characters");
					this.signUpProcessTracker=false;
					return;
				}
				
			  this.name = name;
			  this.surname = surname;
			  if((nameSurnameChecker(name)==true && nameSurnameChecker(surname)==true)==true) {
					System.out.println("Name and Surname is OK.");
				}
				else {
					System.out.println("Name & Surname are not fit with standarts! It must be longer than 2 characters");
					this.signUpProcessTracker=false;
					return;
				}		
			}
	    
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean getSignUpProcessTracker() {
			return signUpProcessTracker;
		}

		public void setSignUpProcessTracker(boolean signUpProcessTracker) {
			this.signUpProcessTracker = signUpProcessTracker;
		}

		//Email String is checking with regex.
		@Override
		public boolean emailChecker(String email) {
			String regex = "^(.+)@(.+)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			if(matcher.matches()==true) {
				return true;
			}
			else
				return false;
		}
		
		//Password must be longer than 6 characters!
		@Override
		public boolean passwordChecker(String password) {
			if(password.length()>=6) {
				return true;
			}
			else
				return false;
		}

		@Override
		public boolean nameSurnameChecker(String password) {
			if(password.length()>=2) {
				return true;
			}
			else
				return false;
		}	
}
