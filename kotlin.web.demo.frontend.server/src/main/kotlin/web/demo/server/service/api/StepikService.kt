package web.demo.server.service.api

import web.demo.server.dtos.course.Course
import web.demo.server.dtos.stepik.ProgressDto

/**
 * @author Alexander Prendota on 2/20/18 JetBrains.
 */
interface StepikService {
    fun getCourseProgress(courseId: String, tokenValue: String): List<ProgressDto>
    fun getCourses(): List<Course>
    fun getCoursesTitles(): List<Course>
    fun getCourseById(id: String): Course
}