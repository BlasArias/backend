package cl.ucn.disc.dsm.pictwin.backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.ZonedDateTime;

@Entity
@Table(name = "pics")
@Builder // Replace the constructor
@NoArgsConstructor
@AllArgsConstructor

public final class Pic {

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
         *The Instance when the Pic was saved.
         */
        @Getter
        @Builder.Default
        private ZonedDateTime timestamp = ZonedDateTime.now();
        /**
         *
         *The date
         */
        @Getter
        @Builder.Default
        private Integer dislikes = 0;
        /**
         *
         *The latitude
         */
        @Getter
        private Double latitude;
        /**
         *
         *The longitude
         */
        @Getter
        private Double longitude;
        /**
         *
         *The error
         */
        @Getter
        private Double error;
        /**
         *
         *The views
         */
        @Getter
        @Builder.Default
        private Integer views = 0;
        /**
         *
         *The views
         */
        @Getter
        private String name;

        @Getter
        private byte[] picture;


        /**
         *
         *The increment of the views
         */

        /*private int incrementViews(){
                views= views+1;
                return views;
        }*/

        public Integer incrementViews(){
                this.views++;
                return this.views;
        }

        public Integer incrementDislikes(){
                this.dislikes++;
                return this.dislikes;
        }

        @Getter
        @Setter
        @ManyToOne(optional = false)
        @JsonBackReference
        private User owner;

}
