package dev.ayush.mydocumentation.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	int id;
	
	@Column(name = "username")
	String username;
	
	@Column(name = "password")
	String password;
	
}
