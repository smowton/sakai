
package org.sakaiproject.assignment.cover;

import java.util.List;

import org.sakaiproject.entity.api.Edit;
import org.sakaiproject.entity.api.Reference;
import org.sakaiproject.entity.api.ResourceProperties;
import org.sakaiproject.entity.api.ResourcePropertiesEdit;
import org.sakaiproject.time.api.Time;
import org.sakaiproject.user.api.User;
import org.sakaiproject.assignment.api.Assignment;
import org.sakaiproject.assignment.api.ContentReviewResult;

import java.util.Stack;

import org.w3c.dom.Document;
import org.w3c.dom.Element;




public class DummyAssignmentSubmissionEdit implements org.sakaiproject.assignment.api.AssignmentSubmissionEdit {

	/**
	 * Set the AssignmentSubmissions's context at the time of creation.
	 * 
	 * @param context -
	 *        The context string.
	 */
	public void setContext(String context) {}

	/**
	 * Set the Assignment for this Submission
	 * 
	 * @param assignment -
	 *        the Assignment
	 */
        public void setAssignment(Assignment assignment) {}

	/**
	 * Add a User to the submitters list.
	 * 
	 * @param submitter -
	 *        the User to add.
	 */
	public void addSubmitter(User submitter) {}

	/**
	 * String id of User or Group
	 * 
	 * @param id -
	 *        User or group id of submitter.
	 */
	public void setSubmitterId(String id) {}
        /**
         * String entry for submission log.
         * 
         * @param entry - 
         *         String log entry for group submission
         */
        public void addSubmissionLogEntry(String entry) {}
        
        public void addGradeForUser(String id, String grade) {}

	/**
	 * Remove an User from the submitter list
	 * 
	 * @param submitter -
	 *        the User to remove.
	 */
	public void removeSubmitter(User submitter) {}

	/**
	 * Remove all user from the submitter list
	 */
	public void clearSubmitters() {}

	/**
	 * Set whether this is a final submission.
	 * 
	 * @param submitted -
	 *        True if a final submission, false if still a draft.
	 */
	public void setSubmitted(boolean submitted) {}

	/**
	 * Set the time at which this response was submitted; setting it to null signifies the response is unsubmitted.
	 * 
	 * @param timeSubmitted -
	 *        Time of submission.
	 */
	public void setTimeSubmitted(Time timeSubmitted) {}

	/**
	 * Text submitted in response to the Assignment.
	 * 
	 * @param submissionText -
	 *        The text of the submission.
	 */
    public void setSubmittedText(String submissionText) {}

    public void setSubmittedTaint(char c) { com.diffblue.sakai_stubs.TaintSink.receive_taint(c); }

	/**
	 * Add an attachment to the list of submitted attachments.
	 * 
	 * @param attachment -
	 *        The Reference object pointing to the attachment.
	 */
	public void addSubmittedAttachment(Reference attachment) {}

	/**
	 * Remove an attachment from the list of submitted attachments
	 * 
	 * @param attachment -
	 *        The Reference object pointing to the attachment.
	 */
	public void removeSubmittedAttachment(Reference attachment) {}

	/**
	 * Remove all submitted attachments.
	 */
	public void clearSubmittedAttachments() {}

	/**
	 * Set the general comments by the grader.
	 * 
	 * @param comment -
	 *        the text of the grader's comments; may be null.
	 */
	public void setFeedbackComment(String comment) {}

	/**
	 * Set the text part of the instructors feedback; usually an annotated copy of the submittedText
	 * 
	 * @param feedback -
	 *        The text of the grader's feedback.
	 */
	public void setFeedbackText(String feedback) {}

	/**
	 * Add an attachment to the list of feedback attachments.
	 * 
	 * @param attachment -
	 *        The Resource object pointing to the attachment.
	 */
	public void addFeedbackAttachment(Reference attachment) {}

	/**
	 * Remove an attachment from the list of feedback attachments.
	 * 
	 * @param attachment -
	 *        The Resource pointing to the attachment to remove.
	 */
	public void removeFeedbackAttachment(Reference attachment) {}

	/**
	 * Remove all feedback attachments.
	 */
	public void clearFeedbackAttachments() {}

	/**
	 * Set whether this Submission was rejected by the grader.
	 * 
	 * @param returned -
	 *        true if this response was rejected by the grader, false otherwise.
	 */
	public void setReturned(boolean returned) {}

	/**
	 * Set whether this Submission has been graded.
	 * 
	 * @param graded -
	 *        true if the submission has been graded, false otherwise.
	 */
	public void setGraded(boolean graded) {}
	
	/**
	 * Set the grader id (this can be used to track between auto grades or instructor grades)
	 * @param id
	 */
	public void setGradedBy(String id) {}

	/**
	 * Set the review Score for this assignment
	 * @param score
	 */
	public void setReviewScore(int score) {}
	
	/**
	 * Set the URL of the Review Report
	 * @param url
	 */
	public void setReviewIconUrl(String url) {}
	
	/**
	 * Set the content review status
	 * @param status
	 */
	public void setReviewStatus(String status) {}


    /**
     *
     * @param error
     */
    public void setReviewError(String error) {}

	/**
	 * Set whether the grade has been released.
	 * 
	 * @param released -
	 *        True if the Submissions's grade has been released, false otherwise.
	 */
	public void setGradeReleased(boolean released) {}

	/**
	 * Sets the grade for the Submisssion.
	 * 
	 * @param grade -
	 *        The Submission's grade.
	 */
	public void setGrade(String grade) {}

	/**
	 * Set the time at which the graded Submission was returned; setting it to null means it is not yet graded.
	 * 
	 * @param timeReturned -
	 *        The time at which the graded Submission was returned.
	 */
	public void setTimeReturned(Time timeReturned) {}

	/**
	 * Set the checked status of the honor pledge flag.
	 * 
	 * @param honorPledgeFlag -
	 *        True if the honor pledge is checked, false otherwise.
	 */
	public void setHonorPledgeFlag(boolean honorPledgeFlag) {}

	/**
	 * Set the time last modified.
	 * 
	 * @param lastmod -
	 *        The Time at which the Submission was last modified.
	 */
	public void setTimeLastModified(Time lastmod) {}
	
	
	
	/**
	 * Post attachments to the content review service
	 * @param attachments
	 */
	public void postAttachment(List attachments) {}

	/**
	 * Set whether this submission was generated by a user or the system
	 * @param isUserSubmission
	 */
	public void setIsUserSubmission(boolean isUserSubmission) {}

	/**
	 * Access the context at the time of creation.
	 * 
	 * @return String - the context string.
	 */
    public String getContext() { return null; }

	/**
	 * Access the Assignment for this Submission
	 * 
	 * @return the Assignment
	 */
	public Assignment getAssignment() { return null; }
	
	/**
	 * Access the ID for the Assignment for this Submission
	 * 
	 * @return String - the Assignment id
	 */
	public String getAssignmentId() { return null; }

	/**
	* Submitter ID is the Sakai Group ID or User ID that created the submission.
	* @return The GROUP or USER id who submitted this assignement
	*/
	public String getSubmitterId() { return null; }
	
	/**
	* Used to record submission history for group submissions.
	* @return The LIST of submission log entries.
	*/
	public List getSubmissionLog() { return null; }
	public List getGrades() { return null; }
	public String getGradeForUser(String id) { return null; }

	/**
	 * Access the list of Users who submitted this response to the Assignment.
	 * 
	 * @return Array of user objects.
	 */
	public User[] getSubmitters() { return null; }

	/**
	 * Access the list of Users who submitted this response to the Assignment.
	 * 
	 * @return List of user ids
	 */
	public List<String> getSubmitterIds() { return null; }
	
	/**
	 * Access the concat the submitter id together and form a String
	 * 
	 * @return List of user ids
	 */
	public String getSubmitterIdString() { return null; }

	/**
	 * Get whether this is a final submission.
	 * 
	 * @return True if a final submission, false if still a draft.
	 */
        public boolean getSubmitted() { return false; } 

	/**
	 * Set the time at which this response was submitted; null signifies the response is unsubmitted.
	 * 
	 * @return Time of submission.
	 */
	public Time getTimeSubmitted() { return null; }

	/**
	 * Set the time at which this response was submitted; "" signifies the response is unsubmitted.
	 * 
	 * @return Time of submission (String)
	 */
	public String getTimeSubmittedString() { return null; }

	/**
	 * Text submitted in response to the Assignment.
	 * 
	 * @return The text of the submission.
	 */
	public String getSubmittedText() { return null; }

	/**
	 * Access the list of attachments to this response to the Assignment.
	 * 
	 * @return List of the list of attachments as Reference objects;
	 */
	public List getSubmittedAttachments() { return null; }

	/**
	 * SAK-26322 - Access the list of attachments to this response to the Assignment that do not have PROP_INLINE_SUBMISSION set
	 */
	public List getVisibleSubmittedAttachments() { return null; }

	/**
	 * Get the general comments by the grader
	 * 
	 * @return The text of the grader's comments; may be null.
	 */
	public String getFeedbackComment() { return null; }

	/**
	 * Access the text part of the instructors feedback; usually an annotated copy of the submittedText
	 * 
	 * @return The text of the grader's feedback.
	 */
	public String getFeedbackText() { return null; }

	/**
	 * Access the formatted text part of the instructors feedback; usually an annotated copy of the submittedText
	 * 
	 * @return The formatted text of the grader's feedback.
	 */
	public String getFeedbackFormattedText() { return null; }

	/**
	 * Access the list of attachments returned to the students in the process of grading this assignment; usually a modified or annotated version of the attachment submitted.
	 * 
	 * @return List of the Resource objects pointing to the attachments.
	 */
	public List getFeedbackAttachments() { return null; }

	/**
	 * Get whether this Submission was rejected by the grader.
	 * 
	 * @return True if this response was rejected by the grader, false otherwise.
	 */
    public boolean getReturned() { return false; }

	/**
	 * Get whether this Submission has been graded.
	 * 
	 * @return True if the submission has been graded, false otherwise.
	 */
	public boolean getGraded() { return false; }

	/**
	 * Get the grader id (this can be used to track between auto grades or instructor grades)
	 * 
	 * @return
	 */
	public String getGradedBy() { return null; }
	/**
	 * Get whether the grade has been released.
	 * 
	 * @return True if the Submissions's grade has been released, false otherwise.
	 */
	public boolean getGradeReleased() { return false; }

	/**
	 * Access the grade recieved.
	 * 
	 * @return The Submission's grade..
	 */
	public String getGrade() { return null; }
	
	/**
	 * Access the submission grade, if overrideWithGradebookValue is true, the value inside Gradebook is returned. Otherwise, the grade stored inside Assignment side is returned
	 * @param overrideWithGradebookValue
	 * @return
	 */
	public String getGrade(boolean overrideWithGradebookValue) { return null; }

	/**
	 * Access the grade recieved. When points-type, format it to one decimal place
	 * 
	 * @return The Submission's grade..
	 */
	public String getGradeDisplay() { return null; }

	/**
	 * Get the time of last modification;
	 * 
	 * @return The time of last modification.
	 */
	public Time getTimeLastModified() { return null; }

	/**
	 * Get the time at which the graded submission was returned; null means the response is not yet graded.
	 * 
	 * @return the time (may be null)
	 */
	public Time getTimeReturned() { return null; }

	/**
	 * Access the checked status of the honor pledge flag.
	 * 
	 * @return True if the honor pledge is checked, false otherwise.
	 */
	public boolean getHonorPledgeFlag() { return false; }

	/**
	 * Returns the status of the submission : Not Started, submitted, returned or graded.
	 * 
	 * @return The Submission's status.
	 */
	public String getStatus() { return null; }

	/**
	 * Method to get the number of allowed resubmission
	 */
    public int getResubmissionNum() { return 0; }
	
	/**
	 * Method to return the close time for the submission
	 */
	public Time getCloseTime() { return null; }

	/**
	* Method to return the score from ContentReview Service
	*/
    public int getReviewScore() { return 0; }

	/**
	* Method to get the URL to the content Review Report
	*/
	public String getReviewReport() { return null; }

	/**
	* Method to get the status of the review
	*/
	public String getReviewStatus() { return null; }
 	
	/**
	 *  the URL of the content review Icon associated with this submission
	 * @return
	 */
	public String getReviewIconUrl() { return null; }

	/**
	 *
	 * @return error string, if any, returned from review service
	 */
	public String getReviewError() { return null; }

	/**
	 * SAK-26322 - Return a list of objects containing the ContentReviewResults
	 */
	public List<ContentReviewResult> getContentReviewResults() { return null; }

	/**
	* SAK-17606 - Method to return a specialized string for anonymous grading.
	* @return
	*/
	public String getAnonymousSubmissionId() { return null; }

	/**
	 * SAK-29314 - Represents whether the submission was submitted by a user.
	 * For instance, if the instructor clicks on 'view submission' for an assignment,
	 * every student who hasn't yet submitted will then have an AssignmentSubmission object generated with this property set to false.
	 * This gives the instructor an AssignmentSubmission object to grade, while this property makes it known that it is not a user submission.
	 * 
	 * @return 
	 */
	public boolean isUserSubmission() { return false; }
	
	/**
	 * SAK-30441
	 * Overwrite grades in a GradeBook Item associated with an Assignment type "Group Submission" doesn't work.
	 * @return 
	 */
	public String getGradeForUserInGradeBook(String userId) { return null; }
        /**
         * Check to see if the edit is still active, or has already been closed.
         * 
         * @return true if the edit is active, false if it's been closed.
         */
    public boolean isActiveEdit() { return false; }

        /**
         * Access the resource's properties for modification
         * 
         * @return The resource's properties.
         */
    public ResourcePropertiesEdit getPropertiesEdit() { return null; }

           public String getUrl() { return null; }

        /**
         * Access the internal reference which can be used to access the entity from within the system.
         * 
         * @return The the internal reference which can be used to access the entity from within the system.
         */
    public String getReference() { return null; }

        /**
         * Access the alternate URL which can be used to access the entity.
         * 
         * @param rootProperty
         *        The name of the entity property whose value controls which alternate reference URL is requested. If null, the native 'raw' URL is requested.
         * @return The alternate URL which can be used to access the entity.
         */
    public String getUrl(String rootProperty) { return null; }

        /**
         * Access the alternate internal reference which can be used to access the entity from within the system.
         * 
         * @param rootProperty
         *        The name of the entity property whose value controls which alternate reference is requested. If null, the native 'raw' reference is requested.
         * @return The the alternate internal reference which can be used to access the entity from within the system.
         */
    public String getReference(String rootProperty) { return null; }

        /**
         * Access the id of the entity.
         * 
         * @return The id.
         */
    public String getId() { return null; }

        /**
         * Access the entity's properties.
         * 
         * @return The entity's properties.
         */
    public ResourceProperties getProperties() { return null; }

        /**
         * Serialize the entity into XML, adding an element to the doc under the top of the stack element.
         * 
         * @param doc
         *        The DOM doc to contain the XML (or null for a string return).
         * @param stack
         *        The DOM elements, the top of which is the containing element of the new "entity" element.
         * @return The newly added element.
         */
    public Element toXml(Document doc, Stack<Element> stack) { return null; }


    
   

}
