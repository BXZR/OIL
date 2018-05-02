/**
 * 
 */
package business.icpscloud.facility.service;

import java.util.List;

//import business.icpscloud.facility.entity.FacilityDataEntity;
import business.icpscloud.facility.entity.FacilityEntity;

/**
 * @author LiPeiXu
 * @ModifyDate 2017��6��20��
 */
public interface FacilityService {

	FacilityEntity findById();
	//FacilityDataEntity findDevData(String id);
	//List<FacilityDataEntity> findDevDataList(String id);

	List<FacilityEntity> findListByLimit(int index, int size);
}
