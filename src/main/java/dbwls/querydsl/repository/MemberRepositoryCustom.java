package dbwls.querydsl.repository;

import dbwls.querydsl.dto.MemberSearchCondition;
import dbwls.querydsl.dto.MemberTeamDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);
    List<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
    List<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);


}
