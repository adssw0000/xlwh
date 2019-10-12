package com\zzg\mybatis\entity\mapper;

import com\zzg\mybatis\entity.Level;
import org.springframework.stereotype.Repository;

/**
 * LevelDAO继承基类
 */
@Repository
public interface LevelDAO extends MyBatisBaseDao<Level, String> {
}