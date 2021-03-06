package cn.edu.bupt.chinacic.pojo.vo;

import cn.edu.bupt.chinacic.pojo.po.Project;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class PublishProjectVo {

    public long id;
    public String name;
    public boolean isPublish;
    public String prize;

    public PublishProjectVo(Project project) {
        BeanUtils.copyProperties(project, this);
    }

}
