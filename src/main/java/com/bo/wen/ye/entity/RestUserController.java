package com.bo.wen.ye.entity;


    

 

 
//@RequestMapping("restful/user")
//@Controller
public class RestUserController {
// 
//    @Autowired
//    private NewUserService newUserService;
// 
//    /**
//     * 根据用户id查询用户数据
//     * 
//     * @param id
//     * @return
//     */
//    @RequestMapping(value = "{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<User> queryUserById(@PathVariable("id") Long id) {
//        try {
//            User user = this.newUserService.queryUserById(id);
//            if (null == user) {
//                // 资源不存在，响应404
//                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//            }
//            // 200
//            // return ResponseEntity.status(HttpStatus.OK).body(user);
//            return ResponseEntity.ok(user);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        // 500
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//    }
// 
//    /**
//     * 新增用户
//     * 
//     * @param user
//     * @return
//     */
//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<Void> saveUser(User user) {
//        try {
//            this.newUserService.saveUser(user);
//            return ResponseEntity.status(HttpStatus.CREATED).build();
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        // 500
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//    }
// 
//    /**
//     * 更新用户资源
//     * 
//     * @param user
//     * @return
//     */
//    @RequestMapping(method = RequestMethod.PUT)
//    public ResponseEntity<Void> updateUser(User user) {
//        try {
//            this.newUserService.updateUser(user);
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        // 500
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//    }
// 
//    /**
//     * 删除用户资源
//     * 
//     * @param user
//     * @return
//     */
//    @RequestMapping(method = RequestMethod.DELETE)
//    public ResponseEntity<Void> deleteUser(@RequestParam(value = "id", defaultValue = "0") Long id) {
//        try {
//            if (id.intValue() == 0) {
//                // 请求参数有误
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//            }
//            this.newUserService.deleteUserById(id);
//            // 204
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        // 500
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//    }
//}
}
