package serialization1;

import java.io.Serializable;

public class Person implements Serializable {

	private int id;
	private String name;

	// transient значит не подлежит сериализации
	private transient String desc;

	// при изменении класса нужно менять serialVersionUID, если serialVersionUID
	// изменился прочитать старый файл не получится
	private static final long serialVersionUID = 1L;

	public Person(int id, String name, String desc) {
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return (getId() + " : " + getName() + " desc is : " + getDesc());
	}
}
