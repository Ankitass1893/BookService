package com.org.librarySyatem.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class BookRequest {

    private String title;

    private String isbn;
    private List<Long> authors;   // Accept author IDs instead of full objects
    private List<Long> genres;    // Accept genre IDs instead of full objects
    private Long libraryBranchId; // Accept library branch ID


}
