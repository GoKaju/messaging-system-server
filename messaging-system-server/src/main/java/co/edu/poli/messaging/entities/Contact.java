package co.edu.poli.messaging.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.edu.poli.messaging.enums.StateEnum;

@Transactional
@Entity
public class Contact {
	
	public StateEnum getState() {
		return state;
	}

	public void setState(StateEnum state) {
		this.state = state;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Integer id;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private User user;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@RestResource(exported = true)
	private User contact;
	@Enumerated(value = EnumType.STRING)
	private StateEnum state = StateEnum.PENDING;
	
	public Contact() {
		
	}
	
	public Contact(User user, User contact) {
		super();
		this.user = user;
		this.contact = contact;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getContact() {
		return contact;
	}

	public void setContact(User contact) {
		this.contact = contact;
	}

}
