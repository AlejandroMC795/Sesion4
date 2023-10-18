package miproyecto.db_driven_adaprter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import miproyecto.core.domain.Book;

@Entity

public class BookEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;

	@Column(name = "name")

	private String name;

	public Book toBook() {

		return new Book(this.id, this.name);

	}

}
