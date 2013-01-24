package si.kcclass.deliverycost.domain;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Country {

	@NotNull
	@Column(unique = true)
	private String code;
    @NotNull
    private String name;
    
    public String toString() {
    	return name;
    }
}
