package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {

    private Long id;
    private int stockQuantity;
    private String author;
    private String name;
    private int price;
    private String isbn;
}
