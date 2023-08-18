package org.koreait.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserProfile {
    @Id
    private Long id;
    private String profileImage;
}
