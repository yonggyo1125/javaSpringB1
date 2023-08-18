package org.koreait.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class HashTag {
    @Id
    @GeneratedValue
    private Long id;

    private String tag;
}
