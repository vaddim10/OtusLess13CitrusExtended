
package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class CreateUserRequest {

    @JsonProperty("job")
    private String Job;
    @JsonProperty("name")
    private String Name;

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "CreateUserRequest{" +
                "Job='" + Job + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
