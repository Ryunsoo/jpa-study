package jpabook.start;

import javax.persistence.*;

@Entity
@SequenceGenerator(
		name = "BOARD_SEQ_GENERATOR",
		sequenceName = "BOARD_SEQ",
		initialValue = 1, allocationSize = 1)
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "BOARD_SEQ_GENERATOR")
	private int id;
	
	@Column(name = "DATA", nullable = false, length = 25)
	private String data;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
