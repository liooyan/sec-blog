package cn.lioyan.blog.exception;

import cn.sec.core.exception.BaseException;
import cn.sec.core.exception.ExceptionKeys;
import com.sec.autoconfigure.exception.DataExistsException;

/**
 * {@link ParameterTypeErrorException}
 *
 * @author com.lioyan
 * @date 2022/5/31  9:58
 */
public class ParameterTypeErrorException extends BaseException
{

    private ParameterTypeErrorException(Integer code)
    {
        super(code);
    }


    public static ParameterTypeErrorException newInstance(String msg)
    {
        return new ParameterTypeErrorException(ExceptionKeys.UPDATE_DATA_MISS_ERROR);
    }

}
