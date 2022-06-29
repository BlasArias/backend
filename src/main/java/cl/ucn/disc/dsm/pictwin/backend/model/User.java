package cl.ucn.disc.dsm.pictwin.backend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public final class User /*implements PicTwin*/{

    /**
     *
     *The Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long Id;
    /**
     *
     *The email for the user
     */
    @Getter
    @NonNull
    @NotBlank
    @Column(unique = true)

    private String email;
    /**
     *
     *The password for the user
     */
    @Getter
    @Setter
    private String password;
    /**
     *
     *The strikes for the user/person
     */
    @Getter
    private int strikes;
    /**
     *
     *The active for the user/person
     */
    @Enumerated(EnumType.STRING)
	@Builder.Default
	@Getter
	@Setter
	private State state = State.ACTIVE;

    /**
     *
     *The increast strikes for the user
     */
    public Integer incrementStrikes(){
        this.strikes++;
        return this.strikes;
    }
    /**
     *
     *The Twins
     */
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    @Builder.Default
    @Getter
    @JsonManagedReference
    private List<Twin> twins = new ArrayList<>();

    public void add(final Twin twin){
        this.twins.add(twin);
    }

}
