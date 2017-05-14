package com.example.constants;

import java.util.Objects;

public enum CategoryExample {
	
	Motoryzacja(1),
	Moda(2),
	Nieruchomosci(3),
	Elektronika(4),
	Dom_i_ogrod(5),
	Rolnictwo(6),
	Zwierzeta(7),
	Muzyka(8),
	Praca(9);
	

	private Integer number;

	CategoryExample(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
    

    public static String getByNumber(final Integer nr) {
        for (CategoryExample name : CategoryExample.values()) {
            if (Objects.equals(name.getNumber(), nr)) {
                return name.name();
            }
        }
        throw new IllegalArgumentException();
    }
	
}
